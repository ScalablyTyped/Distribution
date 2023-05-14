organization := "org.scalablytyped"
name := "conventional-changelog-core"
version := "4.2-dt-20211216Z-594473"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20221230Z-664468",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20221211Z-30809f",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-91fcbc",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-0c902a",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-9e9ab1",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
