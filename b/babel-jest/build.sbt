organization := "org.scalablytyped"
name := "babel-jest"
version := "26.6.3-19cea9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20201102Z-6ad8cf",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20200925Z-ddb884",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-c27ec6",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20201112Z-8e5288",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200925Z-a4f96d",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-603dc7",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-d67580",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-d99f6d",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-d239e7",
  "org.scalablytyped" %%% "jest__transform" % "26.6.2-bb5d03",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-7da828",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
