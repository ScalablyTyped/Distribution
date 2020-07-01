package typings.basicscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimatedType = scala.Double | java.lang.String | scala.Null
  type CallbackFunction = js.Function3[
    /* instance */ typings.basicscroll.mod.BasicScroll, 
    /* percentage */ scala.Double, 
    /* props */ typings.basicscroll.mod.Props, 
    scala.Unit
  ]
  type Props = org.scalablytyped.runtime.StringDictionary[typings.basicscroll.anon.From]
  type TimingFunction = js.Function1[/* t */ scala.Double, scala.Double]
}
