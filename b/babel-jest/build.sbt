organization := "org.scalablytyped"
name := "babel-jest"
version := "29.1.2-3e480d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-b71763",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-b5681a",
  "org.scalablytyped" %%% "babel__parser" % "7.19.3-2e0c60",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3905f1",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-eae752",
  "org.scalablytyped" %%% "babel__types" % "7.19.3-af77a5",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-cd0bb6",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-f4f4b8",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-4b2caf",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-e0c396",
  "org.scalablytyped" %%% "jest__transform" % "29.1.2-3381d7",
  "org.scalablytyped" %%% "jest__types" % "29.1.2-30d6cb",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-e6bd5c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
