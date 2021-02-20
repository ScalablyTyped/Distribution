package typings.builderUtilRuntime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateInfoMod {
  
  @js.native
  trait BlockMapDataHolder extends StObject {
    
    /**
      * The block map file size. Used when block map data is embedded into the file (appimage, windows web installer package).
      * This information can be obtained from the file itself, but it requires additional HTTP request,
      * so, to reduce request count, block map size is specified in the update metadata too.
      */
    var blockMapSize: js.UndefOr[Double] = js.native
    
    val isAdminRightsRequired: js.UndefOr[Boolean] = js.native
    
    /**
      * The file checksum.
      */
    val sha512: String = js.native
    
    /**
      * The file size. Used to verify downloaded size (save one HTTP request to get length).
      * Also used when block map data is embedded into the file (appimage, windows web installer package).
      */
    var size: js.UndefOr[Double] = js.native
  }
  object BlockMapDataHolder {
    
    @scala.inline
    def apply(sha512: String): BlockMapDataHolder = {
      val __obj = js.Dynamic.literal(sha512 = sha512.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockMapDataHolder]
    }
    
    @scala.inline
    implicit class BlockMapDataHolderMutableBuilder[Self <: BlockMapDataHolder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockMapSize(value: Double): Self = StObject.set(x, "blockMapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockMapSizeUndefined: Self = StObject.set(x, "blockMapSize", js.undefined)
      
      @scala.inline
      def setIsAdminRightsRequired(value: Boolean): Self = StObject.set(x, "isAdminRightsRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAdminRightsRequiredUndefined: Self = StObject.set(x, "isAdminRightsRequired", js.undefined)
      
      @scala.inline
      def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PackageFileInfo extends BlockMapDataHolder {
    
    val path: String = js.native
  }
  object PackageFileInfo {
    
    @scala.inline
    def apply(path: String, sha512: String): PackageFileInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageFileInfo]
    }
    
    @scala.inline
    implicit class PackageFileInfoMutableBuilder[Self <: PackageFileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReleaseNoteInfo extends StObject {
    
    /**
      * The note.
      */
    val note: String | Null = js.native
    
    /**
      * The version.
      */
    val version: String = js.native
  }
  object ReleaseNoteInfo {
    
    @scala.inline
    def apply(version: String): ReleaseNoteInfo = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReleaseNoteInfo]
    }
    
    @scala.inline
    implicit class ReleaseNoteInfoMutableBuilder[Self <: ReleaseNoteInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoteNull: Self = StObject.set(x, "note", null)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateFileInfo extends BlockMapDataHolder {
    
    var url: String = js.native
  }
  object UpdateFileInfo {
    
    @scala.inline
    def apply(sha512: String, url: String): UpdateFileInfo = {
      val __obj = js.Dynamic.literal(sha512 = sha512.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateFileInfo]
    }
    
    @scala.inline
    implicit class UpdateFileInfoMutableBuilder[Self <: UpdateFileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateInfo extends StObject {
    
    val files: js.Array[UpdateFileInfo] = js.native
    
    /** @deprecated */
    val path: String = js.native
    
    /**
      * The release date.
      */
    var releaseDate: String = js.native
    
    /**
      * The release name.
      */
    var releaseName: js.UndefOr[String | Null] = js.native
    
    /**
      * The release notes. List if `updater.fullChangelog` is set to `true`, `string` otherwise.
      */
    var releaseNotes: js.UndefOr[String | js.Array[ReleaseNoteInfo] | Null] = js.native
    
    /** @deprecated */
    val sha512: String = js.native
    
    /**
      * The [staged rollout](/auto-update#staged-rollouts) percentage, 0-100.
      */
    val stagingPercentage: js.UndefOr[Double] = js.native
    
    /**
      * The version.
      */
    val version: String = js.native
  }
  object UpdateInfo {
    
    @scala.inline
    def apply(
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
    implicit class UpdateInfoMutableBuilder[Self <: UpdateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[UpdateFileInfo]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: UpdateFileInfo*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseName(value: String): Self = StObject.set(x, "releaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseNameNull: Self = StObject.set(x, "releaseName", null)
      
      @scala.inline
      def setReleaseNameUndefined: Self = StObject.set(x, "releaseName", js.undefined)
      
      @scala.inline
      def setReleaseNotes(value: String | js.Array[ReleaseNoteInfo]): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseNotesNull: Self = StObject.set(x, "releaseNotes", null)
      
      @scala.inline
      def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
      
      @scala.inline
      def setReleaseNotesVarargs(value: ReleaseNoteInfo*): Self = StObject.set(x, "releaseNotes", js.Array(value :_*))
      
      @scala.inline
      def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStagingPercentage(value: Double): Self = StObject.set(x, "stagingPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStagingPercentageUndefined: Self = StObject.set(x, "stagingPercentage", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WindowsUpdateInfo extends UpdateInfo {
    
    var packages: js.UndefOr[StringDictionary[PackageFileInfo] | Null] = js.native
    
    /**
      * @deprecated
      * @private
      */
    var sha2: js.UndefOr[String] = js.native
  }
  object WindowsUpdateInfo {
    
    @scala.inline
    def apply(
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
    implicit class WindowsUpdateInfoMutableBuilder[Self <: WindowsUpdateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPackages(value: StringDictionary[PackageFileInfo]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagesNull: Self = StObject.set(x, "packages", null)
      
      @scala.inline
      def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      @scala.inline
      def setSha2(value: String): Self = StObject.set(x, "sha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha2Undefined: Self = StObject.set(x, "sha2", js.undefined)
    }
  }
}
