organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20211202Z-4ab768"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-34bbcf",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-56434a",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-5ecfac",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-b8d6c0",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-0eee05",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-5df6da",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
