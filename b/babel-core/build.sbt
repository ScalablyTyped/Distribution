organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20180611Z-d2db0b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-c0d92f",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-18b9db",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-157ca0",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-619284",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-8c0e04",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        