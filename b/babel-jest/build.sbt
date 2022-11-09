organization := "org.scalablytyped"
name := "babel-jest"
version := "29.3.1-c67058"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-efd9cc",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-412870",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-021aec",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-744489",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b54012",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-5a1686",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-32acec",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-242218",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a4bec8",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-db208b",
  "org.scalablytyped" %%% "jest__transform" % "29.3.1-743d2e",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-61f653",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-8e6dfd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
