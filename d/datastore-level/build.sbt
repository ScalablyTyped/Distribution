organization := "org.scalablytyped"
name := "datastore-level"
version := "10.1.1-e61f8d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-975e1e",
  "org.scalablytyped" %%% "browser-level" % "1.0.1-5d7d76",
  "org.scalablytyped" %%% "classic-level" % "1.2.0-1d64d0",
  "org.scalablytyped" %%% "datastore-core" % "9.1.1-9a3359",
  "org.scalablytyped" %%% "interface-datastore" % "8.2.0-70429c",
  "org.scalablytyped" %%% "interface-store" % "5.1.0-a4fb4a",
  "org.scalablytyped" %%% "level" % "8.0.0-47b206",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-8f9f42",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-f2ce5f",
  "org.scalablytyped" %%% "multiformats" % "11.0.2-8d8a57",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.3-07439c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
