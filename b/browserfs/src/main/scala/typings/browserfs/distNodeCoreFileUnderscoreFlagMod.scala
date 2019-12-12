package typings.browserfs

import org.scalablytyped.runtime.TopLevel
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType.CREATE_FILE
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType.NOP
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType.THROW_EXCEPTION
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.ActionType.TRUNCATE_FILE
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.FileFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/file_flag", JSImport.Namespace)
@js.native
object distNodeCoreFileUnderscoreFlagMod extends js.Object {
  @js.native
  sealed trait ActionType extends js.Object
  
  @js.native
  class FileFlag protected () extends js.Object {
    /**
      * This should never be called directly.
      * @param modeStr The string representing the mode
      * @throw when the mode string is invalid
      */
    def this(flagStr: String) = this()
    var flagStr: js.Any = js.native
    /**
      * Get the underlying flag string for this flag.
      */
    def getFlagString(): String = js.native
    /**
      * Returns true if the file is appendable.
      */
    def isAppendable(): Boolean = js.native
    /**
      * Returns true if the file is open in exclusive mode.
      */
    def isExclusive(): Boolean = js.native
    /**
      * Returns true if the file is readable.
      */
    def isReadable(): Boolean = js.native
    /**
      * Returns true if the file is open in synchronous mode.
      */
    def isSynchronous(): Boolean = js.native
    /**
      * Returns true if the file mode should truncate.
      */
    def isTruncating(): Boolean = js.native
    /**
      * Returns true if the file is writeable.
      */
    def isWriteable(): Boolean = js.native
    /**
      * Returns one of the static fields on this object that indicates the
      * appropriate response to the path existing.
      */
    def pathExistsAction(): ActionType = js.native
    /**
      * Returns one of the static fields on this object that indicates the
      * appropriate response to the path not existing.
      */
    def pathNotExistsAction(): ActionType = js.native
  }
  
  @js.native
  object ActionType extends js.Object {
    @js.native
    sealed trait CREATE_FILE extends ActionType
    
    @js.native
    sealed trait NOP extends ActionType
    
    @js.native
    sealed trait THROW_EXCEPTION extends ActionType
    
    @js.native
    sealed trait TRUNCATE_FILE extends ActionType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ActionType with Double] = js.native
    /* 3 */ @js.native
    object CREATE_FILE extends TopLevel[CREATE_FILE with Double]
    
    /* 0 */ @js.native
    object NOP extends TopLevel[NOP with Double]
    
    /* 1 */ @js.native
    object THROW_EXCEPTION extends TopLevel[THROW_EXCEPTION with Double]
    
    /* 2 */ @js.native
    object TRUNCATE_FILE extends TopLevel[TRUNCATE_FILE with Double]
    
  }
  
  /* static members */
  @js.native
  object FileFlag extends js.Object {
    var flagCache: js.Any = js.native
    var validFlagStrs: js.Any = js.native
    /**
      * Get an object representing the given file flag.
      * @param modeStr The string representing the flag
      * @return The FileFlag object representing the flag
      * @throw when the flag string is invalid
      */
    def getFileFlag(flagStr: String): FileFlag = js.native
  }
  
}

