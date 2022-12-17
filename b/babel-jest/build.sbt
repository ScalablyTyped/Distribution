organization := "org.scalablytyped"
name := "babel-jest"
version := "29.3.1-314c47"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5ca42e",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-82c4da",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-5a73bf",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-5dfb0f",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-5100e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-b582b5",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-c31bdf",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-d2c38f",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-29762b",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-f49641",
  "org.scalablytyped" %%% "jest__transform" % "29.3.1-c6f77c",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-68e9a6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-019919",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
