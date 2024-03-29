package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageDataConstructor
  extends StObject
     with Instantiable2[/* width */ Double, /* height */ Double, EmulatedImageData]
     with Instantiable3[
      /* pixels */ js.typedarray.Uint8ClampedArray, 
      /* width */ Double, 
      /* height */ Double, 
      EmulatedImageData
    ]
