organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20190213Z-887d58"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-89009d",
  "org.scalablytyped" %%% "babel__parser" % "7.3.2-664e50",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-33bc20",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190213Z-b7168d",
  "org.scalablytyped" %%% "babel__types" % "7.3.2-8e1b94",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        