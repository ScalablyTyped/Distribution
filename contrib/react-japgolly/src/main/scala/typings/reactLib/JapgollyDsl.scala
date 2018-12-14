package typings.reactLib

import typings.reactLib.reactMod.ReactNs._
import typings.reactLib.reactMod.reactModMembers
import typings.stdLib.stdLibMembers.{console, Object}
import typings.{reactLib, stdLib}

import scala.language.{higherKinds, implicitConversions}
import scala.scalajs.js.|
import scala.scalajs.{js, LinkingInfo}

// nothing useful to see here yet, just make sure we compile
object JapgollyDsl {
  import japgolly.scalajs.react.raw.JsNumber

  type Dom[T] = ReactDsl.Dom[T]
}
