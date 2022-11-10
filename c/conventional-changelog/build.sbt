organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20211202Z-c7db2b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-2024e6",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-a43249",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-28287a",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-4d5fcf",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-393a49",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-371318",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
