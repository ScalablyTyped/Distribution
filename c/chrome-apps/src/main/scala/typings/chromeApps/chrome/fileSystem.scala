package typings.chromeApps.chrome

import typings.chromeApps.chromeAppsBooleans.`false`
import typings.chromeApps.chromeAppsBooleans.`true`
import typings.chromeApps.chromeAppsStrings.openDirectory
import typings.chromeApps.chromeAppsStrings.openFile
import typings.chromeApps.chromeAppsStrings.openWritableFile
import typings.chromeApps.chromeAppsStrings.saveFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.fileSystem
////////////////
// FileSystem //
////////////////
/**
  * Use the chrome.fileSystem API to create, read, navigate, and write to the user's local file system.
  * With this API, Chrome Apps can read and write to a user-selected location.
  * For example, a text editor app can use the API to read and write local documents.
  * All failures are notified via chrome.runtime.lastError.
  * @since Chrome 24.
  * @requires Permissions:
  *   'fileSystem'
  *   {'fileSystem': ['write']}
  *   {'fileSystem': ['write', 'retainEntries', 'directory']}
  */
object fileSystem {
  
  trait AcceptOptions extends StObject {
    
    /**
      * This is the optional text description for this option.
      * If not present, a description will be automatically generated;
      * typically containing an expanded list of valid extensions (e.g. 'text/html' may expand to '*.html, *.htm').
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Extensions to accept, e.g. 'jpg', 'gif', 'crx'.
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Mime-types to accept, e.g. 'image/jpeg' or 'audio/ *'. One of mimeTypess must contain at least one valid element.
      */
    var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AcceptOptions {
    
    inline def apply(): AcceptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptOptions]
    }
    
    extension [Self <: AcceptOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ trait ChooseDirectoryEntryOptions
    extends StObject
       with ChooseEntryOptionsBase {
    
    var `type`: openDirectory
  }
  object ChooseDirectoryEntryOptions {
    
    inline def apply(): ChooseDirectoryEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("openDirectory")
      __obj.asInstanceOf[ChooseDirectoryEntryOptions]
    }
    
    extension [Self <: ChooseDirectoryEntryOptions](x: Self) {
      
      inline def setType(value: openDirectory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chrome.fileSystem.ChooseFileEntryOptions
    - typings.chromeApps.chrome.fileSystem.ChooseSaveFileEntryOptions
    - typings.chromeApps.chrome.fileSystem.ChooseMultipleFilesEntryOptions
    - typings.chromeApps.chrome.fileSystem.ChooseDirectoryEntryOptions
    - typings.chromeApps.chrome.fileSystem.ChooseEntryOptionsBase
  */
  trait ChooseEntryOptions extends StObject
  object ChooseEntryOptions {
    
    inline def ChooseDirectoryEntryOptions(): typings.chromeApps.chrome.fileSystem.ChooseDirectoryEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("openDirectory")
      __obj.asInstanceOf[typings.chromeApps.chrome.fileSystem.ChooseDirectoryEntryOptions]
    }
    
    inline def ChooseEntryOptionsBase(): typings.chromeApps.chrome.fileSystem.ChooseEntryOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chromeApps.chrome.fileSystem.ChooseEntryOptionsBase]
    }
    
    inline def ChooseFileEntryOptions(`type`: openFile | openWritableFile): typings.chromeApps.chrome.fileSystem.ChooseFileEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chromeApps.chrome.fileSystem.ChooseFileEntryOptions]
    }
    
    inline def ChooseMultipleFilesEntryOptions(`type`: openFile | openWritableFile): typings.chromeApps.chrome.fileSystem.ChooseMultipleFilesEntryOptions = {
      val __obj = js.Dynamic.literal(acceptsMultiple = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chromeApps.chrome.fileSystem.ChooseMultipleFilesEntryOptions]
    }
    
    inline def ChooseSaveFileEntryOptions(): typings.chromeApps.chrome.fileSystem.ChooseSaveFileEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("saveFile")
      __obj.asInstanceOf[typings.chromeApps.chrome.fileSystem.ChooseSaveFileEntryOptions]
    }
  }
  
  trait ChooseEntryOptionsBase
    extends StObject
       with ChooseEntryOptions {
    
    /**
      * The optional list of accept options for this file opener.
      * Each option will be presented as a unique group to the end-user.
      */
    var accepts: js.UndefOr[js.Array[AcceptOptions]] = js.undefined
    
    /**
      * Whether to accept all file types, in addition to the options specified in the accepts argument.
      * If the accepts field is unset or contains no valid entries, this will always be reset to true.
      * @default true
      */
    var acceptsAllTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Type of the prompt to show.
      * @default 'openFile'
      * @see ChooseEntryType
      */
    // type?: ToStringLiteral<typeof ChooseEntryType>;
    /**
      * The suggested file name that will be presented to the user as the default name to read or write.
      */
    var suggestedName: js.UndefOr[String] = js.undefined
  }
  object ChooseEntryOptionsBase {
    
    inline def apply(): ChooseEntryOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChooseEntryOptionsBase]
    }
    
    extension [Self <: ChooseEntryOptionsBase](x: Self) {
      
      inline def setAccepts(value: js.Array[AcceptOptions]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAcceptsAllTypes(value: Boolean): Self = StObject.set(x, "acceptsAllTypes", value.asInstanceOf[js.Any])
      
      inline def setAcceptsAllTypesUndefined: Self = StObject.set(x, "acceptsAllTypes", js.undefined)
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setAcceptsVarargs(value: AcceptOptions*): Self = StObject.set(x, "accepts", js.Array(value :_*))
      
      inline def setSuggestedName(value: String): Self = StObject.set(x, "suggestedName", value.asInstanceOf[js.Any])
      
      inline def setSuggestedNameUndefined: Self = StObject.set(x, "suggestedName", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ trait ChooseFileEntryOptions
    extends StObject
       with ChooseEntryOptionsBase {
    
    /**
      * Whether to accept multiple files. This is only supported for openFile and openWritableFile.
      * The callback to chooseEntry will be called with a list of entries if this is set to true.
      * Otherwise it will be called with a single Entry.
      * @default false
      * @since Chrome 30.
      */
    var acceptsMultiple: js.UndefOr[`false`] = js.undefined
    
    var `type`: openFile | openWritableFile
  }
  object ChooseFileEntryOptions {
    
    inline def apply(`type`: openFile | openWritableFile): ChooseFileEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChooseFileEntryOptions]
    }
    
    extension [Self <: ChooseFileEntryOptions](x: Self) {
      
      inline def setAcceptsMultiple(value: `false`): Self = StObject.set(x, "acceptsMultiple", value.asInstanceOf[js.Any])
      
      inline def setAcceptsMultipleUndefined: Self = StObject.set(x, "acceptsMultiple", js.undefined)
      
      inline def setType(value: openFile | openWritableFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ trait ChooseMultipleFilesEntryOptions
    extends StObject
       with ChooseEntryOptionsBase {
    
    /**
      * Whether to accept multiple files. This is only supported for openFile and openWritableFile.
      * The callback to chooseEntry will be called with a list of entries if this is set to true.
      * Otherwise it will be called with a single Entry.
      * @default false
      * @since Chrome 30.
      */
    var acceptsMultiple: `true`
    
    var `type`: openFile | openWritableFile
  }
  object ChooseMultipleFilesEntryOptions {
    
    inline def apply(`type`: openFile | openWritableFile): ChooseMultipleFilesEntryOptions = {
      val __obj = js.Dynamic.literal(acceptsMultiple = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChooseMultipleFilesEntryOptions]
    }
    
    extension [Self <: ChooseMultipleFilesEntryOptions](x: Self) {
      
      inline def setAcceptsMultiple(value: `true`): Self = StObject.set(x, "acceptsMultiple", value.asInstanceOf[js.Any])
      
      inline def setType(value: openFile | openWritableFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ trait ChooseSaveFileEntryOptions
    extends StObject
       with ChooseEntryOptionsBase {
    
    var `type`: saveFile
  }
  object ChooseSaveFileEntryOptions {
    
    inline def apply(): ChooseSaveFileEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("saveFile")
      __obj.asInstanceOf[ChooseSaveFileEntryOptions]
    }
    
    extension [Self <: ChooseSaveFileEntryOptions](x: Self) {
      
      inline def setType(value: saveFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** @private */
  type FileEntryCallback[T /* <: ChooseEntryOptions */, E] = js.Function1[/* selectedEntries */ E, Unit]
  
  /**
    * @since Chrome 44.
    */
  trait Volume extends StObject {
    
    /** The ID of the requested volume. */
    var volumeId: String
    
    /**
      * Whether the requested file system should be writable. The default is read-only.
      * @default false
      **/
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object Volume {
    
    inline def apply(volumeId: String): Volume = {
      val __obj = js.Dynamic.literal(volumeId = volumeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Volume]
    }
    
    extension [Self <: Volume](x: Self) {
      
      inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
}
