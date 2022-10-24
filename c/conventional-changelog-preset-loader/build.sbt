organization := "org.scalablytyped"
name := "conventional-changelog-preset-loader"
version := "2.3-dt-20220624Z-c9bbbf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-581982",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-7a0d74",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-68f017",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-30ee27",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-2b0a56",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-066477",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
