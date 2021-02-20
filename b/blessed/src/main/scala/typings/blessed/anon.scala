package typings.blessed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bg extends StObject {
    
    var bg: js.UndefOr[String] = js.native
    
    var fg: js.UndefOr[String] = js.native
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
  
  @js.native
  trait BoolCount extends StObject {
    
    var boolCount: Double = js.native
    
    var dataSize: Double = js.native
    
    var headerSize: Double = js.native
    
    var lastStrTableOffset: Double = js.native
    
    var numCount: Double = js.native
    
    var strCount: Double = js.native
    
    var strTableSize: Double = js.native
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
  
  @js.native
  trait Bools extends StObject {
    
    var bools: js.Any = js.native
    
    var desc: String = js.native
    
    var header: DataSize = js.native
    
    var name: String = js.native
    
    var names: js.Array[String] = js.native
    
    var numbers: js.Any = js.native
    
    var strings: js.Any = js.native
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
  
  @js.native
  trait Ch extends StObject {
    
    var ch: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var track: js.UndefOr[js.Any] = js.native
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
  
  @js.native
  trait DataSize extends StObject {
    
    var boolCount: Double = js.native
    
    var dataSize: Double = js.native
    
    var extended: BoolCount = js.native
    
    var headerSize: Double = js.native
    
    var magicNumber: Boolean = js.native
    
    var namesSize: Double = js.native
    
    var numCount: Double = js.native
    
    var strCount: Double = js.native
    
    var strTableSize: Double = js.native
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
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
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
