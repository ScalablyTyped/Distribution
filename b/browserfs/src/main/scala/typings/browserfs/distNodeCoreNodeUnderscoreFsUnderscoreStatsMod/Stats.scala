package typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod

import typings.node.Buffer
import typings.node.fsMod.StatsBase
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends StatsBase[Double] {
  var fileData: Buffer | Null
  /**
    * Change the mode of the file. We use this helper function to prevent messing
    * up the type of the file, which is encoded in mode.
    */
  def chmod(mode: Double): Unit
  def toBuffer(): Buffer
}

object Stats {
  @scala.inline
  def apply(
    atime: Date,
    atimeMs: Double,
    birthtime: Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    chmod: Double => Unit,
    clone: () => Stats,
    ctime: Date,
    ctimeMs: Double,
    dev: Double,
    gid: Double,
    ino: Double,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double,
    mtime: Date,
    mtimeMs: Double,
    nlink: Double,
    rdev: Double,
    size: Double,
    toBuffer: () => Buffer,
    uid: Double,
    fileData: Buffer = null
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime, atimeMs = atimeMs, birthtime = birthtime, birthtimeMs = birthtimeMs, blksize = blksize, blocks = blocks, chmod = js.Any.fromFunction1(chmod), clone = js.Any.fromFunction0(clone), ctime = ctime, ctimeMs = ctimeMs, dev = dev, gid = gid, ino = ino, isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode, mtime = mtime, mtimeMs = mtimeMs, nlink = nlink, rdev = rdev, size = size, toBuffer = js.Any.fromFunction0(toBuffer), uid = uid)
    if (fileData != null) __obj.updateDynamic("fileData")(fileData)
    __obj.asInstanceOf[Stats]
  }
}

