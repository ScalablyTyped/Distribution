organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20201028Z-7421be"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.1-dt-20201028Z-7ca1cd",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20200113Z-3322af",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20201026Z-17ca64",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.0-dt-20201028Z-03c1e7",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20200113Z-3a1445",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20200515Z-5c4860",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
