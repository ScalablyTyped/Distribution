organization := "org.scalablytyped"
name := "babel-plugin-macros"
version := "2.8-dt-20201114Z-2b58c8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20201102Z-fe3103",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20200925Z-30d042",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-2a748a",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20201112Z-ac0d64",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200925Z-daa30e",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-d40586",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
