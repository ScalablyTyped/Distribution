organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20201028Z-ea78b1"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.1-dt-20201028Z-44c500",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20200113Z-0355e5",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20201026Z-6814c6",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.0-dt-20201028Z-e44ce8",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20200113Z-4c2878",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20200515Z-0e78a8",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
