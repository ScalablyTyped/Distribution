organization := "org.scalablytyped"
name := "babel__register"
version := "7.17-dt-20220624Z-b03e6b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-61b7b8",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-42cbbf",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-c798fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3669d2",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b1d659",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-8b54ca",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
