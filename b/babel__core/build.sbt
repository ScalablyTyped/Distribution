organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-465ee2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181115Z-fef333",
  "org.scalablytyped" %%% "babel__parser" % "7.2.3-ba929f",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181115Z-29e80d",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181128Z-436282",
  "org.scalablytyped" %%% "babel__types" % "7.2.2-cccd00",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        