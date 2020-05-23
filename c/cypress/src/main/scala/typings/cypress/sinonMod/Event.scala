package typings.cypress.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sinon uses DOM dependencies which are absent in browser-less environment like node.js
// to avoid compiler errors this monkey patch is used
// see more details in https://github.com/DefinitelyTyped/DefinitelyTyped/issues/11351
trait Event extends js.Object

