organization := "org.scalablytyped"
name := "babel-plugin-jest-hoist"
version := "29.5.0-7b755f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.20-dt-20230118Z-e25db7",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-589aa7",
  "org.scalablytyped" %%% "babel__parser" % "7.21.8-43580a",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-a71ff4",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20230426Z-96f2d9",
  "org.scalablytyped" %%% "babel__types" % "7.21.5-fbdd8a",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
