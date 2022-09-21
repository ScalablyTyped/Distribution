package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Accessor[T, V] = js.Function2[/* datum */ T, /* index */ js.UndefOr[Double], V]

type UnitFunction = js.Function3[
/* start */ Double | js.Date, 
/* end */ Double | js.Date, 
/* domain */ js.UndefOr[Double | js.Array[String]], 
Double | (js.Array[Double | js.Date | String])]
