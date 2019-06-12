organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-d691e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-a435ba",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-5e2e26",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-c9e977",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-a0f0bc",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-508671",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        