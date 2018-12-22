organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-56d992"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181115Z-593e26",
  "org.scalablytyped" %%% "babel__parser" % "7.2.3-1a5585",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181115Z-849210",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181128Z-01b644",
  "org.scalablytyped" %%% "babel__types" % "7.2.2-26f0cf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        