organization := "org.scalablytyped"
name := "contract-proxy-kit"
version := "1.0-dt-20200225Z-e0062c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ethers" % "5.0.21-6e31fb",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.0.0-beta.153-1ef250",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.0.6-6bc3d3",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.0.8-33e005",
  "org.scalablytyped" %%% "ethersproject__address" % "5.0.7-abe3fc",
  "org.scalablytyped" %%% "ethersproject__basex" % "5.0.5-452a2d",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.0.10-f7bd0b",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.0.6-9cfdf9",
  "org.scalablytyped" %%% "ethersproject__contracts" % "5.0.7-e49234",
  "org.scalablytyped" %%% "ethersproject__hash" % "5.0.7-17f710",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.0.6-5213e7",
  "org.scalablytyped" %%% "ethersproject__json-wallets" % "5.0.8-d506f7",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.0.7-b01371",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.0.5-f6d8ba",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.0.5-300415",
  "org.scalablytyped" %%% "ethersproject__providers" % "5.0.15-f3f52d",
  "org.scalablytyped" %%% "ethersproject__sha2" % "5.0.5-d39bac",
  "org.scalablytyped" %%% "ethersproject__signing-key" % "5.0.6-6108db",
  "org.scalablytyped" %%% "ethersproject__strings" % "5.0.6-7fa991",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.0.7-edfae2",
  "org.scalablytyped" %%% "ethersproject__wallet" % "5.0.8-c67be2",
  "org.scalablytyped" %%% "ethersproject__web" % "5.0.10-099c66",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.0.6-a19038",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-fda7ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
