organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-9f5616"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-cc28b6",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-876ed7",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-60931b",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-afe7cd",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-29523a",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        