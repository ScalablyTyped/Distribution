organization := "org.scalablytyped"
name := "babel-plugin-jest-hoist"
version := "26.6.2-61d962"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20201102Z-5b6203",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20200925Z-48955e",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-799cf5",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20201112Z-d395fe",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200925Z-c6297b",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-8c7046",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
