organization := "org.scalablytyped"
name := "babel__standalone"
version := "7.1-dt-20211223Z-7b3485"
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
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
