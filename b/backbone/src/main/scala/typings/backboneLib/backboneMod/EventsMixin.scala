package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper to avoid code repetition in type declarations.
  * Backbone.Events cannot be extended, hence a separate abstract
  * class with a different name. Both classes and interfaces can
  * extend from this helper class to reuse the signatures.
  *
  * For class type declarations that already extend another base
  * class, and for actual class definitions, please see the
  * Events_* interfaces above.
  */
@JSImport("backbone", "EventsMixin")
@js.native
abstract class EventsMixin () extends js.Object

