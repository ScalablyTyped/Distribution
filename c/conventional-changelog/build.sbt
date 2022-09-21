organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20211202Z-104be7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-913ac4",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-8ee545",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-e326c3",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-b6e1f3",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-f5c735",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-a06a5e",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
