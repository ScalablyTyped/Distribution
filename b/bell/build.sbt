organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20200515Z-152bb7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-9ffb4e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-cb8cb5",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-6783f5",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-1344e9",
  "org.scalablytyped" %%% "joi" % "17.3.0-91f698",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-3ec634",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-550963",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-dfec96",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-4387e0",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
