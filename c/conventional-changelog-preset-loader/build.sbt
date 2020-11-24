organization := "org.scalablytyped"
name := "conventional-changelog-preset-loader"
version := "2.3-dt-20200117Z-71cd8c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.1-dt-20201028Z-afc7fc",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20200113Z-429d73",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20201026Z-6b6575",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.0-dt-20201028Z-08070b",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20200113Z-3816de",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20200515Z-f4dd80",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
