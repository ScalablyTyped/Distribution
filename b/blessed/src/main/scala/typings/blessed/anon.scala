package typings.blessed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bg extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
  }
  object Bg {
    
    inline def apply(): Bg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bg]
    }
    
    extension [Self <: Bg](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    }
  }
  
  trait BoolCount extends StObject {
    
    var boolCount: Double
    
    var dataSize: Double
    
    var headerSize: Double
    
    var lastStrTableOffset: Double
    
    var numCount: Double
    
    var strCount: Double
    
    var strTableSize: Double
  }
  object BoolCount {
    
    inline def apply(
      boolCount: Double,
      dataSize: Double,
      headerSize: Double,
      lastStrTableOffset: Double,
      numCount: Double,
      strCount: Double,
      strTableSize: Double
    ): BoolCount = {
      val __obj = js.Dynamic.literal(boolCount = boolCount.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], lastStrTableOffset = lastStrTableOffset.asInstanceOf[js.Any], numCount = numCount.asInstanceOf[js.Any], strCount = strCount.asInstanceOf[js.Any], strTableSize = strTableSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoolCount]
    }
    
    extension [Self <: BoolCount](x: Self) {
      
      inline def setBoolCount(value: Double): Self = StObject.set(x, "boolCount", value.asInstanceOf[js.Any])
      
      inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setLastStrTableOffset(value: Double): Self = StObject.set(x, "lastStrTableOffset", value.asInstanceOf[js.Any])
      
      inline def setNumCount(value: Double): Self = StObject.set(x, "numCount", value.asInstanceOf[js.Any])
      
      inline def setStrCount(value: Double): Self = StObject.set(x, "strCount", value.asInstanceOf[js.Any])
      
      inline def setStrTableSize(value: Double): Self = StObject.set(x, "strTableSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bools extends StObject {
    
    var bools: Any
    
    var desc: String
    
    var header: DataSize
    
    var name: String
    
    var names: js.Array[String]
    
    var numbers: Any
    
    var strings: Any
  }
  object Bools {
    
    inline def apply(
      bools: Any,
      desc: String,
      header: DataSize,
      name: String,
      names: js.Array[String],
      numbers: Any,
      strings: Any
    ): Bools = {
      val __obj = js.Dynamic.literal(bools = bools.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bools]
    }
    
    extension [Self <: Bools](x: Self) {
      
      inline def setBools(value: Any): Self = StObject.set(x, "bools", value.asInstanceOf[js.Any])
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: DataSize): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setNumbers(value: Any): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setStrings(value: Any): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ch extends StObject {
    
    var ch: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var track: js.UndefOr[Any] = js.undefined
  }
  object Ch {
    
    inline def apply(): Ch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ch]
    }
    
    extension [Self <: Ch](x: Self) {
      
      inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTrack(value: Any): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
  
  trait DataSize extends StObject {
    
    var boolCount: Double
    
    var dataSize: Double
    
    var extended: BoolCount
    
    var headerSize: Double
    
    var magicNumber: Boolean
    
    var namesSize: Double
    
    var numCount: Double
    
    var strCount: Double
    
    var strTableSize: Double
  }
  object DataSize {
    
    inline def apply(
      boolCount: Double,
      dataSize: Double,
      extended: BoolCount,
      headerSize: Double,
      magicNumber: Boolean,
      namesSize: Double,
      numCount: Double,
      strCount: Double,
      strTableSize: Double
    ): DataSize = {
      val __obj = js.Dynamic.literal(boolCount = boolCount.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], extended = extended.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], magicNumber = magicNumber.asInstanceOf[js.Any], namesSize = namesSize.asInstanceOf[js.Any], numCount = numCount.asInstanceOf[js.Any], strCount = strCount.asInstanceOf[js.Any], strTableSize = strTableSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSize]
    }
    
    extension [Self <: DataSize](x: Self) {
      
      inline def setBoolCount(value: Double): Self = StObject.set(x, "boolCount", value.asInstanceOf[js.Any])
      
      inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      inline def setExtended(value: BoolCount): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setMagicNumber(value: Boolean): Self = StObject.set(x, "magicNumber", value.asInstanceOf[js.Any])
      
      inline def setNamesSize(value: Double): Self = StObject.set(x, "namesSize", value.asInstanceOf[js.Any])
      
      inline def setNumCount(value: Double): Self = StObject.set(x, "numCount", value.asInstanceOf[js.Any])
      
      inline def setStrCount(value: Double): Self = StObject.set(x, "strCount", value.asInstanceOf[js.Any])
      
      inline def setStrTableSize(value: Double): Self = StObject.set(x, "strTableSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
