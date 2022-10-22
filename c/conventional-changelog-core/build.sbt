organization := "org.scalablytyped"
name := "conventional-changelog-core"
version := "4.2-dt-20211216Z-0f5276"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-83fdfb",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-1c1679",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-b80cb1",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-370c74",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-d48b2a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
