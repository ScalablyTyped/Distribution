organization := "org.scalablytyped"
name := "babel-jest"
version := "29.3.1-445cec"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5b3929",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-5fc152",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-10b9d5",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b27c06",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-352082",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-a88e29",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-560c9d",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-8f49ad",
  "org.scalablytyped" %%% "jest__transform" % "29.3.1-f763f9",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-d79af1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-351ac1",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
