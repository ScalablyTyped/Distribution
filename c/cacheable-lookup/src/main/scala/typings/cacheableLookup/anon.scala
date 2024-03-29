package typings.cacheableLookup

import typings.cacheableLookup.mod.IPFamily
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupAllOptions
import typings.node.dnsMod.LookupOneOptions
import typings.node.dnsMod.LookupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined cacheable-lookup.cacheable-lookup.LookupOptions & {  all :true} */
  trait LookupOptionsalltrue extends StObject {
    
    /**
    	 * When `true`, the callback returns all resolved addresses in an array. Otherwise, returns a single address.
    	 * @default false
    	 */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * The record family. Must be `4` or `6`. IPv4 and IPv6 addresses are both returned by default.
    	 */
    var family: js.UndefOr[IPFamily] = js.undefined
    
    /**
    	 * One or more supported getaddrinfo flags. Multiple flags may be passed by bitwise ORing their values.
    	 */
    var hints: js.UndefOr[Double] = js.undefined
  }
  object LookupOptionsalltrue {
    
    inline def apply(): LookupOptionsalltrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LookupOptionsalltrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LookupOptionsalltrue] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setFamily(value: IPFamily): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    }
  }
  
  @js.native
  trait Typeoflookup extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      family: Double,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupAllOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOneOptions,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOptions,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* address */ String | js.Array[LookupAddress], 
          /* family */ Double, 
          Unit
        ]
    ): Unit = js.native
  }
}
