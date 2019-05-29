organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-8944de"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-433e24",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-15156c",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-739ba1",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-39b2de",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-c6b3f1",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        