organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20201028Z-a6ede0"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.1-dt-20201028Z-038ce3",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20200113Z-e48282",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20201026Z-8a3acf",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.0-dt-20201028Z-49e553",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20200113Z-9372e4",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20200515Z-bfc29a",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
