organization := "org.scalablytyped"
name := "conventional-changelog-core"
version := "4.2-dt-20211216Z-53f07e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-8db636",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-c69fb7",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-20a638",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-1f7e71",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-3e3611",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
