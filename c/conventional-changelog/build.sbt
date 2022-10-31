organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20211202Z-e64f65"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-db8b46",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-7a77cf",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-83600c",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-23d431",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-3dda69",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-066477",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
