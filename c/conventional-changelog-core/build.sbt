organization := "org.scalablytyped"
name := "conventional-changelog-core"
version := "4.1-dt-20201028Z-a01c68"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20200113Z-bd5f0d",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20201026Z-79c152",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.0-dt-20201028Z-2bb61d",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20200113Z-dd1818",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20200515Z-ca1f81",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
