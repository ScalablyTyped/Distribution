package typings.commander.commanderMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommanderStatic
  extends typings.commander.commanderMod.localNs.Command {
  var Command: Instantiable1[js.UndefOr[/* name */ String], typings.commander.commanderMod.localNs.Command] = js.native
  var CommandOptions: typings.commander.commanderMod.CommandOptions = js.native
  var Option: Instantiable2[
    /* flags */ String, 
    js.UndefOr[/* description */ String], 
    typings.commander.commanderMod.localNs.Option
  ] = js.native
  var ParseOptionsResult: typings.commander.commanderMod.ParseOptionsResult = js.native
}

