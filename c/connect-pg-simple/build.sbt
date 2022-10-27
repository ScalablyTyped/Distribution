organization := "org.scalablytyped"
name := "connect-pg-simple"
version := "7.0-dt-20211202Z-316ff9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-7a82fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-87e3cc",
  "org.scalablytyped" %%% "express-session" % "1.17-dt-20220707Z-c8fb06",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-d4808c",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-4b9f85",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-ee5af1",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5e7139",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
