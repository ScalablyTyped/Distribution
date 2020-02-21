organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-c8edfd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-e28c76",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-6da945",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-a2b5ac",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-c3c496",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-72da7d",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
