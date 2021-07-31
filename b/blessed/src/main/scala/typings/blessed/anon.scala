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
    
    @scala.inline
    def apply(): Bg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bg]
    }
    
    @scala.inline
    implicit class BgMutableBuilder[Self <: Bg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BoolCountMutableBuilder[Self <: BoolCount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolCount(value: Double): Self = StObject.set(x, "boolCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastStrTableOffset(value: Double): Self = StObject.set(x, "lastStrTableOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumCount(value: Double): Self = StObject.set(x, "numCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrCount(value: Double): Self = StObject.set(x, "strCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrTableSize(value: Double): Self = StObject.set(x, "strTableSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bools extends StObject {
    
    var bools: js.Any
    
    var desc: String
    
    var header: DataSize
    
    var name: String
    
    var names: js.Array[String]
    
    var numbers: js.Any
    
    var strings: js.Any
  }
  object Bools {
    
    @scala.inline
    def apply(
      bools: js.Any,
      desc: String,
      header: DataSize,
      name: String,
      names: js.Array[String],
      numbers: js.Any,
      strings: js.Any
    ): Bools = {
      val __obj = js.Dynamic.literal(bools = bools.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bools]
    }
    
    @scala.inline
    implicit class BoolsMutableBuilder[Self <: Bools] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBools(value: js.Any): Self = StObject.set(x, "bools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: DataSize): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setNumbers(value: js.Any): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrings(value: js.Any): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ch extends StObject {
    
    var ch: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var track: js.UndefOr[js.Any] = js.undefined
  }
  object Ch {
    
    @scala.inline
    def apply(): Ch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ch]
    }
    
    @scala.inline
    implicit class ChMutableBuilder[Self <: Ch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTrack(value: js.Any): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DataSizeMutableBuilder[Self <: DataSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolCount(value: Double): Self = StObject.set(x, "boolCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtended(value: BoolCount): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagicNumber(value: Boolean): Self = StObject.set(x, "magicNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesSize(value: Double): Self = StObject.set(x, "namesSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumCount(value: Double): Self = StObject.set(x, "numCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrCount(value: Double): Self = StObject.set(x, "strCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrTableSize(value: Double): Self = StObject.set(x, "strTableSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
