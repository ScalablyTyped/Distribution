organization := "org.scalablytyped"
name := "conventional-changelog-core"
version := "4.2-dt-20211216Z-0566ca"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-062b45",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-7e5ff2",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-51f3c7",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-f5315d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-066477",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
