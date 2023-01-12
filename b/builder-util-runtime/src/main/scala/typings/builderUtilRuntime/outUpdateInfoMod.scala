package typings.builderUtilRuntime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUpdateInfoMod {
  
  trait BlockMapDataHolder extends StObject {
    
    /**
      * The block map file size. Used when block map data is embedded into the file (appimage, windows web installer package).
      * This information can be obtained from the file itself, but it requires additional HTTP request,
      * so, to reduce request count, block map size is specified in the update metadata too.
      */
    var blockMapSize: js.UndefOr[Double] = js.undefined
    
    val isAdminRightsRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file checksum.
      */
    val sha512: String
    
    /**
      * The file size. Used to verify downloaded size (save one HTTP request to get length).
      * Also used when block map data is embedded into the file (appimage, windows web installer package).
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object BlockMapDataHolder {
    
    inline def apply(sha512: String): BlockMapDataHolder = {
      val __obj = js.Dynamic.literal(sha512 = sha512.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockMapDataHolder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockMapDataHolder] (val x: Self) extends AnyVal {
      
      inline def setBlockMapSize(value: Double): Self = StObject.set(x, "blockMapSize", value.asInstanceOf[js.Any])
      
      inline def setBlockMapSizeUndefined: Self = StObject.set(x, "blockMapSize", js.undefined)
      
      inline def setIsAdminRightsRequired(value: Boolean): Self = StObject.set(x, "isAdminRightsRequired", value.asInstanceOf[js.Any])
      
      inline def setIsAdminRightsRequiredUndefined: Self = StObject.set(x, "isAdminRightsRequired", js.undefined)
      
      inline def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PackageFileInfo
    extends StObject
       with BlockMapDataHolder {
    
    val path: String
  }
  object PackageFileInfo {
    
    inline def apply(path: String, sha512: String): PackageFileInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageFileInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageFileInfo] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReleaseNoteInfo extends StObject {
    
    /**
      * The note.
      */
    val note: String | Null
    
    /**
      * The version.
      */
    val version: String
  }
  object ReleaseNoteInfo {
    
    inline def apply(version: String): ReleaseNoteInfo = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], note = null)
      __obj.asInstanceOf[ReleaseNoteInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReleaseNoteInfo] (val x: Self) extends AnyVal {
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteNull: Self = StObject.set(x, "note", null)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateFileInfo
    extends StObject
       with BlockMapDataHolder {
    
    var url: String
  }
  object UpdateFileInfo {
    
    inline def apply(sha512: String, url: String): UpdateFileInfo = {
      val __obj = js.Dynamic.literal(sha512 = sha512.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateFileInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateFileInfo] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateInfo extends StObject {
    
    val files: js.Array[UpdateFileInfo]
    
    /** @deprecated */
    val path: String
    
    /**
      * The release date.
      */
    var releaseDate: String
    
    /**
      * The release name.
      */
    var releaseName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The release notes. List if `updater.fullChangelog` is set to `true`, `string` otherwise.
      */
    var releaseNotes: js.UndefOr[String | js.Array[ReleaseNoteInfo] | Null] = js.undefined
    
    /** @deprecated */
    val sha512: String
    
    /**
      * The [staged rollout](/auto-update#staged-rollouts) percentage, 0-100.
      */
    val stagingPercentage: js.UndefOr[Double] = js.undefined
    
    /**
      * The version.
      */
    val version: String
  }
  object UpdateInfo {
    
    inline def apply(
      files: js.Array[UpdateFileInfo],
      path: String,
      releaseDate: String,
      sha512: String,
      version: String
    ): UpdateInfo = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateInfo] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: js.Array[UpdateFileInfo]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: UpdateFileInfo*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleaseName(value: String): Self = StObject.set(x, "releaseName", value.asInstanceOf[js.Any])
      
      inline def setReleaseNameNull: Self = StObject.set(x, "releaseName", null)
      
      inline def setReleaseNameUndefined: Self = StObject.set(x, "releaseName", js.undefined)
      
      inline def setReleaseNotes(value: String | js.Array[ReleaseNoteInfo]): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
      
      inline def setReleaseNotesNull: Self = StObject.set(x, "releaseNotes", null)
      
      inline def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
      
      inline def setReleaseNotesVarargs(value: ReleaseNoteInfo*): Self = StObject.set(x, "releaseNotes", js.Array(value*))
      
      inline def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      inline def setStagingPercentage(value: Double): Self = StObject.set(x, "stagingPercentage", value.asInstanceOf[js.Any])
      
      inline def setStagingPercentageUndefined: Self = StObject.set(x, "stagingPercentage", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait WindowsUpdateInfo
    extends StObject
       with UpdateInfo {
    
    var packages: js.UndefOr[StringDictionary[PackageFileInfo] | Null] = js.undefined
    
    /**
      * @deprecated
      * @private
      */
    var sha2: js.UndefOr[String] = js.undefined
  }
  object WindowsUpdateInfo {
    
    inline def apply(
      files: js.Array[UpdateFileInfo],
      path: String,
      releaseDate: String,
      sha512: String,
      version: String
    ): WindowsUpdateInfo = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsUpdateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowsUpdateInfo] (val x: Self) extends AnyVal {
      
      inline def setPackages(value: StringDictionary[PackageFileInfo]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesNull: Self = StObject.set(x, "packages", null)
      
      inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      inline def setSha2(value: String): Self = StObject.set(x, "sha2", value.asInstanceOf[js.Any])
      
      inline def setSha2Undefined: Self = StObject.set(x, "sha2", js.undefined)
    }
  }
}
