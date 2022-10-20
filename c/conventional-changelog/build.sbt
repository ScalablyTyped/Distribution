organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20211202Z-83fbb4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-f2c787",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-1b9590",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-0584ee",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-b2db66",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-326797",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-d48b2a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
