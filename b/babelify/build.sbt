organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20180611Z-46a932"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-64e7a9",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-fd958c",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-162d79",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-9c3631",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-912813",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-ad217f",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        