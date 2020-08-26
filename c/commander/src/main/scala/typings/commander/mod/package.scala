package typings.commander

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CommandConstructor = org.scalablytyped.runtime.Instantiable1[/* name */ js.UndefOr[java.lang.String], typings.commander.mod.Command]
  type CommanderErrorConstructor = org.scalablytyped.runtime.Instantiable3[
    /* exitCode */ scala.Double, 
    /* code */ java.lang.String, 
    /* message */ java.lang.String, 
    typings.commander.mod.CommanderError
  ]
  type OptionConstructor = org.scalablytyped.runtime.Instantiable2[
    /* flags */ java.lang.String, 
    /* description */ js.UndefOr[java.lang.String], 
    typings.commander.mod.Option
  ]
}
