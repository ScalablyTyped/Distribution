organization := "com.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20180910Z-17a2bc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "babel-core" % "6.25-dt-20180910Z-d0a22e",
  "com.scalablytyped" %%% "babel-generator" % "6.25-dt-20180910Z-3a02f7",
  "com.scalablytyped" %%% "babel-template" % "6.25-dt-20180910Z-db16a8",
  "com.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180910Z-ad41f5",
  "com.scalablytyped" %%% "babel-types" % "7.0-dt-20180910Z-5654be",
  "com.scalablytyped" %%% "babylon" % "6.16-dt-20181109Z-efe294",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        