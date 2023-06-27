organization := "org.scalablytyped"
name := "babel-plugin-tester"
version := "9.0-dt-20220512Z-33a0d7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.20-dt-20230525Z-b39835",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-4c2037",
  "org.scalablytyped" %%% "babel__parser" % "7.22.5-7bfc37",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-b8bfad",
  "org.scalablytyped" %%% "babel__traverse" % "7.20-dt-20230601Z-de1db8",
  "org.scalablytyped" %%% "babel__types" % "7.22.5-26d1a8",
  "org.scalablytyped" %%% "prettier" % "2.7-dt-20230531Z-2a847e",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
